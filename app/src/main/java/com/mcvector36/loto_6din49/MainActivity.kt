package com.mcvector36.loto_6din49

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.viewinterop.AndroidView
import android.webkit.WebView
import android.webkit.WebViewClient
import com.mcvector36.loto_6din49.ui.theme.Loto6Din49Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Loto6Din49Theme {
                // A surface container using the 'background' color from the theme
                WebViewComponent("https://www.youtube.com/")
            }
        }
    }
}

@Composable
fun WebViewComponent(url: String) {
    AndroidView(
        modifier = Modifier.fillMaxSize(),
        factory = { context ->
            WebView(context).apply {
                webViewClient = WebViewClient()
                loadUrl(url)
            }
        }
    )
}

@Preview(showBackground = true)
@Composable
fun WebViewComponentPreview() {
    Loto6Din49Theme {
        WebViewComponent("https://www.youtube.com/")
    }
}
