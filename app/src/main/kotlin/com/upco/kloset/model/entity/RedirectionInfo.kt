package com.upco.kloset.model.entity

/**
 * Created by felps on 04/02/2018.
 */
data class RedirectionInfo(var error: Boolean = false,
                           var message: String = "",
                           var parameters: ArrayList<Map<String, String>> = arrayListOf())