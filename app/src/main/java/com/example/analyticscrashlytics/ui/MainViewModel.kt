package com.example.analyticscrashlytics.ui

import androidx.lifecycle.ViewModel
import com.example.analyticscrashlytics.data.AnalyticsManager
import com.example.analyticscrashlytics.data.AnalyticsModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(private val analyticsManager: AnalyticsManager) : ViewModel() {

    fun example(){
        analyticsManager.example()
        analyticsManager.example2()
    }


    fun exampleCustom(){
      val analyticsModel = AnalyticsModel(
          title = "Nou_event_custom",
          analyticsString = listOf(
              Pair("super", "proo"),
              Pair("mega", "200")
          )
      )

        analyticsManager.sendEvent(analyticsModel)
    }
}