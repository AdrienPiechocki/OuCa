package com.example.ouca

import com.rickclephas.kmm.viewmodel.KMMViewModel
import com.rickclephas.kmm.viewmodel.MutableStateFlow
import com.rickclephas.kmp.nativecoroutines.NativeCoroutinesState

open class CuriosityViewModel: KMMViewModel() {

    val HistoricCuriosity1 = HistoricCuriosity(
        name = "Tour Eiffel",
        latitude = 0F,
        longitude = 0F
    )
    @NativeCoroutinesState
    val CurrentCuriosity = MutableStateFlow(viewModelScope,HistoricCuriosity1)
}