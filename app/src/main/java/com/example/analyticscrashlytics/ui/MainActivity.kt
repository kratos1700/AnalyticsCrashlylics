package com.example.analyticscrashlytics.ui

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.analyticscrashlytics.ui.theme.AnalyticsCrashlyticsTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AnalyticsCrashlyticsTheme {
                val mainViewModel: MainViewModel = hiltViewModel()
                Scaffold(modifier = Modifier.fillMaxSize()) {
                    PantallaScreen(mainViewModel)
                }
            }
        }
    }
}


@Composable
fun PantallaScreen(mainViewModel: MainViewModel) {

    mainViewModel.example()
    mainViewModel.exampleCustom()


}