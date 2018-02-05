package com.upco.kloset.contract

import android.app.Application
import io.realm.Realm

/**
 * Created by felps on 22/10/17.
 */
class Application: Application() {

    override fun onCreate() {
        super.onCreate()

        // Inicializa o Realm
        Realm.init(this)
    }
}