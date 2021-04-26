package com.badzohugues.splitztemplateapp.di

import android.content.Context
import com.badzohugues.splitztemplateapp.SplitzTemplateApplication
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {
    @Singleton
    @Provides
    fun provideApplication(@ApplicationContext application: Context): SplitzTemplateApplication = application as SplitzTemplateApplication
}