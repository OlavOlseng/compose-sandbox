package no.olseng.sandbox.ui.view

import android.content.res.Configuration
import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.animateContentSize
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import no.olseng.sandbox.R
import no.olseng.sandbox.model.Message
import no.olseng.sandbox.model.SampleData
import no.olseng.sandbox.ui.theme.SandboxTheme

@Composable
fun MessageCard(msg: Message) {
    SandboxTheme {
        Row(
            modifier = Modifier.padding(all = 8.dp),
        ) {
            Image(
                modifier = Modifier
                    .size(40.dp)
                    .clip(CircleShape)
                    .border(1.5f.dp, MaterialTheme.colors.secondary, CircleShape),
                painter = painterResource(R.drawable.ic_launcher_foreground),
                contentDescription = "Butiful app logo",
            )
            Spacer(Modifier.width(8.dp))

            var isExpanded by remember { mutableStateOf(false) }
            val surfaceColor: Color by animateColorAsState(
                if (isExpanded) MaterialTheme.colors.primary else MaterialTheme.colors.surface)

            Column(Modifier.clickable { isExpanded = !isExpanded }) {
                Text(
                    text = msg.author,
                    color = MaterialTheme.colors.secondaryVariant,
                    style = MaterialTheme.typography.subtitle2
                )
                Spacer(modifier = Modifier.height(4.dp))
                Surface(
                    modifier = Modifier.animateContentSize().padding(2.dp),
                    shape = MaterialTheme.shapes.medium,
                    elevation = 2.dp,
                    color = surfaceColor
                ) {
                    Text(
                        modifier = Modifier.padding(all = 8.dp),
                        maxLines = if (isExpanded) Int.MAX_VALUE else 1,
                        text = msg.body,
                        style = MaterialTheme.typography.caption,
                        overflow = TextOverflow.Ellipsis
                    )
                }
            }
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
fun PreviewMessageCard() {
    SandboxTheme {
        MessageCard(SampleData.sampleMessage)
    }
}


