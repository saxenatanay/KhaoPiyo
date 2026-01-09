package com.example.khaopiyo


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.khaopiyo.ui.theme.KhaoPiyoTheme
import com.example.khaopiyo.ui.theme.DeepPurpleA100
import com.example.khaopiyo.ui.theme.DeepPurpleA200
import com.example.khaopiyo.ui.theme.PoppinsFontFamily
import com.example.khaopiyo.ui.theme.white

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            KhaoPiyoTheme {
                Surface {
                    LoginScreen(
                        onLoginClick = { email, password ->
                            // TODO: login logic
                            println("Email: $email, Password: $password")
                        },
                        onSignupClick = {
                            // TODO: navigate to signup screen
                        }
                    )
                }
            }
        }
    }
}