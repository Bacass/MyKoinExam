package com.koin.exam

import android.app.Application
import com.koin.exam.ui.main.Animal
import com.koin.exam.ui.main.Cat
import com.koin.exam.ui.main.MainViewModel
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.core.context.startKoin
import org.koin.dsl.module

class MyApplication : Application() {

    val appModule = module {
        single { Animal() }
        factory { Cat(get()) }
        viewModel { MainViewModel() }
    }

    override fun onCreate() {
        super.onCreate()

        startKoin {
            // context를 사용.
            androidContext(this@MyApplication)
            // Koin Logger를 사용.
            androidLogger()
            // 모듈을 셋팅해준다.
            modules(appModule)
        }
    }
}