package com.lighthouselabs.dagger2talk.dagger

import com.lighthouselabs.dagger2talk.Dagger2Application
import com.lighthouselabs.dagger2talk.dagger.modules.ApplicationModule
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector

@Component(modules = [
    AndroidInjectionModule::class,
    ApplicationModule::class
])
interface ApplicationComponent : AndroidInjector<Dagger2Application>