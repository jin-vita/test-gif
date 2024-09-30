package com.example.testgif

import android.view.Window
import android.view.WindowInsets
import android.view.WindowInsetsController
import androidx.appcompat.app.ActionBar
import androidx.core.view.WindowCompat

object Utils {
    fun applyFullScreen(supportActionBar: ActionBar?, window: Window) {
        supportActionBar?.hide()

        window.setDecorFitsSystemWindows(false)
        WindowCompat.setDecorFitsSystemWindows(window, false)

        window.insetsController?.apply {
            this.hide(WindowInsets.Type.systemBars() or WindowInsets.Type.statusBars() or WindowInsets.Type.navigationBars())
            this.systemBarsBehavior = WindowInsetsController.BEHAVIOR_SHOW_TRANSIENT_BARS_BY_SWIPE
        }
    }
}