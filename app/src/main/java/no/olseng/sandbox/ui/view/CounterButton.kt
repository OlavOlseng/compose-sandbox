package no.olseng.sandbox.ui.view

import android.content.res.Configuration
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.ButtonElevation
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.semantics.Role.Companion.Button
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import no.olseng.sandbox.ui.theme.SandboxTheme

@Composable
fun CounterButton(count: Int, onClick: () -> Unit) {
    Button(
        elevation = ButtonDefaults.elevation(0.dp),
        onClick = onClick,
    )
    {
        Text(text = "Click count: $count")
    }
}

@Preview("LightMode", showBackground = true)
@Preview("DarkMode", showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
fun CounterButtonPreview() {
    SandboxTheme {
        CounterButton(count = 0) {}
    }
}