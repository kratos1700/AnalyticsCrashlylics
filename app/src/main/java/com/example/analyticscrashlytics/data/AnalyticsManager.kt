package com.example.analyticscrashlytics.data

import com.google.firebase.analytics.FirebaseAnalytics
import com.google.firebase.analytics.logEvent
import javax.inject.Inject


class AnalyticsManager @Inject constructor(private val analytics: FirebaseAnalytics) {

    fun example() {
        analytics.logEvent(FirebaseAnalytics.Event.APP_OPEN) {
            param(FirebaseAnalytics.Param.SOURCE, "100")
        }
    }

    fun example2() {
        analytics.logEvent("TEST_EXEMPLE_2") {
            param("super", "proo")
            param("mega", "200")
        }
    }


    fun sendEvent(analyticsModel: AnalyticsModel) {
        analytics.logEvent(analyticsModel.title){
            analyticsModel.analyticsString.map { param(it.first, it.second) } // este map es para recorrer la lista de Pair<String,String> y agregar los parametros al evento de firebase
        }
        analyticsModel.analyticsDouble.map { analytics.logEvent(analyticsModel.title){ param(it.first, it.second) } }
        analyticsModel.analyticsBundle.map { analytics.logEvent(analyticsModel.title){ param(it.first, it.second) } }
        analyticsModel.analyticsLong.map { analytics.logEvent(analyticsModel.title){ param(it.first, it.second) } }
        analyticsModel.analyticsBundleArray.map { analytics.logEvent(analyticsModel.title){ param(it.first, it.second) } }

    }

}