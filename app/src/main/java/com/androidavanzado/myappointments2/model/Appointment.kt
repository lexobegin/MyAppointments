package com.androidavanzado.myappointments2.model

data class Appointment (
        val id: Int,
        val doctorName: String,
        val scheduledDate: String,
        val scheduledTime: String
    )