package com.example.parcelable

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize
import java.time.LocalDateTime
@Parcelize
data class MessageInfo(val content: String, val send_time: LocalDateTime): Parcelable {

}
