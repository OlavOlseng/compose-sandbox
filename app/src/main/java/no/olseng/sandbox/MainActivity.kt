package no.olseng.sandbox

import android.content.res.Configuration
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import no.olseng.sandbox.model.SampleData
import no.olseng.sandbox.ui.theme.SandboxTheme
import no.olseng.sandbox.ui.view.CounterButton
import no.olseng.sandbox.ui.view.MessageList


class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SandboxTheme {
                SandboxApp()
            }
        }
    }

    @Composable
    fun SandboxApp() {
        var clickCount by remember {
            mutableStateOf(0)
        }
        Column {
            Row {
                TopAppBar(
                    Modifier.fillMaxWidth()
                ) {
                    Column (Modifier.weight(1f)){
                        Text(
                            modifier = Modifier
                                .padding(8.dp),
                            style = MaterialTheme.typography.h6,
                            text = stringResource(id = R.string.app_name)
                        )
                    }
                    Column(
                        modifier = Modifier
                            .padding(8.dp),
                    )
                    {
                        //Keeping state in the composable is wrong :(
                        CounterButton(count = clickCount) { clickCount += 1 }
                    }
                }
            }
            Row {
                MessageList(messages = SampleData.enormousSampleMessageList)
            }
        }
    }

    @Composable
    @Preview(
        name = "Light Mode",
        showBackground = true,
    )
    @Preview(
        name = "Dark Mode",
        showBackground = true,
        uiMode = Configuration.UI_MODE_NIGHT_YES,
    )
    fun SandboxAppPreview() {
        SandboxTheme {
            SandboxApp()
        }
    }
}






