package com.example.myruns1

import android.graphics.Bitmap
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class LocalStorageViewModel: ViewModel() {
    val profilePhotoImage = MutableLiveData<Bitmap>()

}
