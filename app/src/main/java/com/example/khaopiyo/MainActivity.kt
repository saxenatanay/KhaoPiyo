package com.example.khaopiyo


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Surface
import com.example.khaopiyo.ui.theme.KhaoPiyoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            KhaoPiyoTheme {
                Surface {
                    AppNavigation()
                }
            }
        }
    }
}