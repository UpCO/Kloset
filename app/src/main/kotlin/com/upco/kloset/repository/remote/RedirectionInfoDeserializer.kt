package com.upco.kloset.repository.remote

import com.google.gson.JsonDeserializationContext
import com.google.gson.JsonDeserializer
import com.google.gson.JsonElement
import com.google.gson.JsonObject
import com.upco.kloset.model.entity.RedirectionInfo
import java.lang.reflect.Type

/**
 * Created by felps on 04/02/2018.
 */
class RedirectionInfoDeserializer: JsonDeserializer<RedirectionInfo> {

    companion object {
        private val KEY_ERROR = "error"
        private val KEY_MESSAGE = "message"
        private val KEY_PARAMETERS = "parameters"
        private val KEY_ITEMS = "items"
    }

    override fun deserialize(json: JsonElement?, typeOfT: Type?, context: JsonDeserializationContext?): RedirectionInfo {
        val jsonObject = json?.asJsonObject

        // Read default values
        val error = jsonObject?.get(KEY_ERROR)?.asBoolean
        val message = jsonObject?.get(KEY_MESSAGE)?.asString

        // Read dynamic parameters object
        val parameters = readParametersMap(jsonObject)

        return RedirectionInfo(error!!, message!!, parameters!!)
    }

    private fun readParametersMap(jsonObject: JsonObject?): ArrayList<Map<String, Any>>? {
        val paramsElement = jsonObject!![KEY_PARAMETERS] ?: return null
        val paramsArray = paramsElement.asJsonArray

        val params = arrayListOf<Map<String, Any>>()
        for (element: JsonElement in paramsArray) {
            val obj = element.asJsonObject

            val paramsMap = hashMapOf<String, Any>()
            for (entry: Map.Entry<String, JsonElement> in obj.entrySet()) {
                when (entry.key) {
                    KEY_ITEMS -> run {
                        val items = arrayListOf<Map<String, String>>()
                        for (item: JsonElement in obj[KEY_ITEMS].asJsonArray) {
                            val itemMap = hashMapOf<String, String>()
                            for (itemEntry: Map.Entry<String, JsonElement> in item.asJsonObject.entrySet()) {
                                val key = itemEntry.key
                                val value = itemEntry.value.asString
                                itemMap.put(key, value)
                            }
                            items.add(itemMap)
                        }
                        paramsMap.put(entry.key, items)
                    }
                    else -> run {
                        val key = entry.key
                        val value = entry.value
                        paramsMap.put(key, value)
                    }
                }
            }
            params.add(paramsMap)
        }

        return params
    }
}