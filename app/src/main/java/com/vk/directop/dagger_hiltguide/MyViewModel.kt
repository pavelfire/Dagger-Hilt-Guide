package com.vk.directop.dagger_hiltguide

import androidx.lifecycle.ViewModel
import com.vk.directop.dagger_hiltguide.domain.repository.MyRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MyViewModel @Inject constructor(
    private val repository: MyRepository
//    private val repository: Lazy<MyRepository>
) : ViewModel() {

//    init {
//        repository.get()
//    }

}