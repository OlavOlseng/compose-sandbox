package no.olseng.sandbox

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import no.olseng.sandbox.model.SampleData
import no.olseng.sandbox.ui.theme.SandboxTheme
import no.olseng.sandbox.ui.view.MessageList


class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SandboxTheme {
                MessageList(messages = SampleData.sampleMessageList)
            }
        }
    }
}






