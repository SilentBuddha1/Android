package com.silent.learning

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.res.Configuration
import android.widget.Toast

class LocaleChangeReceiver : BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
        if (intent?.action == Intent.ACTION_LOCALE_CHANGED) {
            val newLocale = context?.resources?.configuration?.locales?.get(0)
            Toast.makeText(context, "Locale changed to ${newLocale?.displayLanguage}", Toast.LENGTH_SHORT).show()
            // You can add more logic here to update your app's UI or behavior based on the new locale
        }
    }
}