function carregar() {

var agora = new Date ()
var hora = agora.getHours()
var minutos = agora.getMinutes()
var msg = document.getElementById('msg')
var img = document.getElementById('imagem')
msg.innerHTML = `Agora são exatamente ${hora}:${minutos}h.<br>`

if (hora >= 6 && hora <= 12) {
    img.src="manhã.png"
    document.body.style.backgroundColor = '#8e631a'
    msg.innerHTML += `Bom dia!`
    } else if (hora >= 12 && hora <= 18) {
        img.src="tarde.png"
        document.body.style.backgroundColor = '#bdce3c'
        msg.innerHTML += `Boa tarde!`
        } else if (hora >= 18 && hora < 23) {
            img.src="noite.png"
            document.body.style.backgroundColor = '#a180b7'
            msg.innerHTML += `Boa noite!`
            } else {
                img.src="madrugada.png"
                document.body.style.backgroundColor = '#405061'
                msg.innerHTML += `Boa madrugada!`
            }
}

