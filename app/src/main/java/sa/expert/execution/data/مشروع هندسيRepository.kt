package sa.expert.execution.data

import sa.expert.execution.model.مشروع هندسي
import sa.expert.execution.model.خدمة هندسية
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

interface مشروع هندسيRepository {
    fun getAvailableCatalog(): Flow<List<خدمة هندسية>>
    fun getActiveRequest(): Flow<مشروع هندسي?>
    suspend fun submitRequest(request: مشروع هندسي): Result<String>
}

class InMemoryمشروع هندسيRepository : مشروع هندسيRepository {
    private val _catalog = MutableStateFlow<List<خدمة هندسية>>(listOf(
        خدمة هندسية("1", "استشارة هندسية مدنية", "خدمة استشارية متخصصة في الهندسة المدنية", 5000L, "verified"),
        خدمة هندسية("2", "إشراف هندسي إنشائي", "خدمة الإشراف على المشاريع الإنشائية", 9500L, "bolt")
    ))
    private val _active = MutableStateFlow<مشروع هندسي?>(null)

    override fun getAvailableCatalog(): Flow<List<خدمة هندسية>> = _catalog.asStateFlow()
    override fun getActiveRequest(): Flow<مشروع هندسي?> = _active.asStateFlow()

    override suspend fun submitRequest(request: مشروع هندسي): Result<String> {
        _active.value = request
        return Result.success(request.requestId)
    }
}
