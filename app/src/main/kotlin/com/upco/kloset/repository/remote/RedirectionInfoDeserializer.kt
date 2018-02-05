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

    private fun readParametersMap(jsonObject: JsonObject?): ArrayList<Map<String, String>>? {
        val paramsElement = jsonObject!![KEY_PARAMETERS] ?: return null
        val paramsArray = paramsElement.asJsonArray

        val params = arrayListOf<Map<String, String>>()
        for (element: JsonElement in paramsArray) {
            val obj = element.asJsonObject

            val map = hashMapOf<String, String>()
            for (entry: Map.Entry<String, JsonElement> in obj.entrySet()) {
                val key = entry.key
                val value = entry.value.asString
                map.put(key, value)
            }
            params.add(map)
        }
        return params
    }
}