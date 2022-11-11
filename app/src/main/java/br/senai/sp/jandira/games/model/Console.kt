package br.senai.sp.jandira.games.model

import android.graphics.Bitmap
import java.time.LocalDate

class Console {

    var codigo = 0
    var nome = ""
    var email = ""
    var senha = ""
    var cidade = ""
    var dataNascimento: LocalDate? = null
    var anoLancamento = 0
    var foto : Bitmap? = null
    var sexo = 'I'
    var nivel = NiveisEnum.INICIANTE
    var console: Console? = null
}