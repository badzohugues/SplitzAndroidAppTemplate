package com.badzohugues.splitztemplateapp.common

import android.app.Activity
import android.view.View
import androidx.fragment.app.Fragment
import androidx.viewbinding.ViewBinding

interface ViewBindingHelper<B : ViewBinding> {
    
    val binding: B?
    
    fun initBinding(binding: B, fragment: Fragment, onBound: B.() -> Unit): View
    
    fun initBinding(binding: B, activity: Activity, onBound: B.() -> Unit): View
    
    fun requireBinding(block: (B.() -> Unit)? = null): B
}
