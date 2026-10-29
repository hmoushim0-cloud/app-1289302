package sa.expert.execution.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import sa.expert.execution.data.مشروع هندسيRepository
import sa.expert.execution.model.مشروع هندسي
import sa.expert.execution.model.خدمة هندسية
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.launch

class مشروع هندسيViewModel(
    private val repository: مشروع هندسيRepository
) : ViewModel() {
    val catalog: StateFlow<List<خدمة هندسية>> = repository.getAvailableCatalog()
        .stateIn(viewModelScope, SharingStarted.WhileSubscribed(5000), emptyList())

    val activeRequest: StateFlow<مشروع هندسي?> = repository.getActiveRequest()
        .stateIn(viewModelScope, SharingStarted.WhileSubscribed(5000), null)

    fun submitNewOrder(request: مشروع هندسي) {
        viewModelScope.launch {
            repository.submitRequest(request)
        }
    }
}
