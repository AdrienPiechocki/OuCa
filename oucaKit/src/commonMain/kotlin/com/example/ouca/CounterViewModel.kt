package app.myeline.ouca

import com.rickclephas.kmm.viewmodel.KMMViewModel
import com.rickclephas.kmm.viewmodel.MutableStateFlow
import com.rickclephas.kmp.nativecoroutines.NativeCoroutinesState

open class CounterViewModel: KMMViewModel() {

    @NativeCoroutinesState
    val count = MutableStateFlow(viewModelScope,0)
    @NativeCoroutinesState
    val hue = MutableStateFlow(viewModelScope,0F)
    @NativeCoroutinesState
    val light = MutableStateFlow(viewModelScope,1F)
    fun incrementCount() {
        if(count.value<100) {
            count.value++
            hue.value += 1F
            light.value -= 0.01F
        }

    }

    fun decrementCount() {
        if(count.value>0) {
            count.value--
            hue.value -= 1F
            light.value += 0.01F
        }
    }

    fun resetCount() {
        count.value=0
        hue.value=0F
        light.value = 1F
    }

    fun maxCount() {
        count.value=100
        hue.value=100F
        light.value = 0F
    }

    fun randomizeCount() {
        val n = (0..100).shuffled().last()
        count.value = n
        hue.value = n.toFloat()
        light.value = 1F-(n.toFloat()/100)

    }

}