package no.olseng.sandbox.ui.view

import android.content.res.Configuration
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material.Divider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import no.olseng.sandbox.model.Message
import no.olseng.sandbox.model.SampleData
import no.olseng.sandbox.ui.theme.SandboxTheme

@Composable
fun MessageList(messages: List<Message>) {
    LazyColumn {
        itemsIndexed(messages) {i, message ->
            MessageCard(msg = message)
            if (i != messages.size - 1)
                Divider(modifier = Modifier.padding(horizontal = 8.dp))
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
        MessageList(messages = SampleData.sampleMessageList.subList(0, 3))
    }
}