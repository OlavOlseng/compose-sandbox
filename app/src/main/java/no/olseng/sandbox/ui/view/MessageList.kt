package no.olseng.sandbox.ui.view

import android.content.res.Configuration
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import no.olseng.sandbox.model.Message
import no.olseng.sandbox.model.SampleData
import no.olseng.sandbox.ui.theme.SandboxTheme

@Composable
fun MessageList(messages: List<Message>) {
    LazyColumn {
        items(messages) { message ->
            MessageCard(msg = message)
        }
    }
}

@Preview(
    name = "Light Mode",
    showBackground = true
)
@Preview(
    name = "Dark Mode",
    uiMode = Configuration.UI_MODE_NIGHT_YES,
    showBackground = true
)
@Composable
fun MessageListPreview() {
    SandboxTheme {
        MessageList(messages = SampleData.sampleMessageList)
    }
}