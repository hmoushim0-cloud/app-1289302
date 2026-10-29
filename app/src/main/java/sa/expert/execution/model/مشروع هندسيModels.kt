package sa.expert.execution.model

import kotlinx.serialization.Serializable

@Serializable
data class خدمة هندسية(
    val id: String,
    val title: String,
    val description: String,
    val priceMinorUnits: Long,
    val iconVector: String = "verified"
)

@Serializable
data class مشروع هندسي(
    val requestId: String,
    val items: List<خدمة هندسية>,
    val customerPhone: String,
    val totalAmountMinorUnits: Long,
    val status: مشروع هندسيStatus = مشروع هندسيStatus.PENDING,
    val createdAtEpochMs: Long = System.currentTimeMillis()
)

enum class مشروع هندسيStatus {
    PENDING,
    ACCEPTED,
    IN_PROGRESS,
    COMPLETED,
    CANCELLED
}
