package com.frogobox.research

import android.os.Bundle
import com.frogobox.research.base.BaseActivity
import com.frogobox.research.databinding.ActivityMainBinding

class MainActivity : BaseActivity<ActivityMainBinding>() {

    override fun setupViewBinding(): ActivityMainBinding {
        return ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupChainView()
        setupSecurity()
    }

}