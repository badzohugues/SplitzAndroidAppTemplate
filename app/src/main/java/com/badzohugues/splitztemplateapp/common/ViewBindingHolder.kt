package com.badzohugues.splitztemplateapp.common

import android.app.Activity
import android.view.View
import androidx.fragment.app.Fragment
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.OnLifecycleEvent
import androidx.viewbinding.ViewBinding

interface ViewBindingHolder<T: ViewBinding> : ViewBindingHelper<T>, LifecycleObserver {
    override var binding: T? = null
    var lifecycle: Lifecycle? = null
    
    private lateinit var fragmentName: String
    
    
    override fun initBinding(binding: T, fragment: Fragment, onBound: T.() -> Unit): View {
        this.binding = binding
        lifecycle = fragment.viewLifecycleOwner.lifecycle
        lifecycle?.addObserver(this)
        fragmentName = fragment::class.simpleName ?: "N/A"
        onBound.invoke(binding)
        return binding.root
    }
    
    override fun initBinding(binding: T, activity: Activity, onBound: T.() -> Unit): View {
        TODO("Not yet implemented")
    }
    
    /**
     * To not leak memory we nullify the binding when the view is destroyed.
     */
    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    fun onDestroyView() {
        lifecycle?.removeObserver(this) // not mandatory, but preferred
        lifecycle = null
        binding = null
    }
    
    override fun requireBinding(block: (T.() -> Unit)?) =
        binding?.apply { block?.invoke(this) } ?: throw IllegalStateException("Accessing binding outside of Fragment lifecycle: $fragmentName")
    
}
