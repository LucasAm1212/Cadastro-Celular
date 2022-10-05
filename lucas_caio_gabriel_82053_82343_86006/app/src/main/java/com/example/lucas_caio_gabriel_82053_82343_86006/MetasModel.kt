package com.example.lucas_caio_gabriel_82053_82343_86006

import android.os.Parcel
import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class MetasModel(
    val Modelo: String,
    val Marca: String,
    val Cor: String
) : Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readString(),
        parcel.readString(),
        parcel.readString()
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(Modelo)
        parcel.writeString(Marca)
        parcel.writeString(Cor)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<MetasModel> {
        override fun createFromParcel(parcel: Parcel): MetasModel {
            return MetasModel(parcel)
        }

        override fun newArray(size: Int): Array<MetasModel?> {
            return arrayOfNulls(size)
        }
    }
}