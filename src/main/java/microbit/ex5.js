input.onButtonPressed(Button.AB, function () {
    if (IZONE == 0) {
        basic.showString("Hello!")
    } else if (IZONE == 1) {
        basic.showString("name?")
    } else if (IZONE == 2) {
        basic.showString("color?")
    } else if (IZONE == 3) {
        basic.showString("age?")
    }
    radio.sendNumber(IZONE)
})
input.onButtonPressed(Button.A, function () {
    IZONE += 1
    if (IZONE == 4) {
        IZONE = 3
    }
    basic.showNumber(IZONE)
})
input.onButtonPressed(Button.B, function () {
    IZONE += -1
    if (IZONE == -1) {
        IZONE = 0
    }
    basic.showNumber(IZONE)
})
radio.onReceivedNumberDeprecated(function (receivedNumber) {
    if (receivedNumber == 0) {
        basic.showString("Hello!")
    } else if (receivedNumber == 1) {
        basic.showString("SangDae")
    } else if (receivedNumber == 2) {
        basic.showString("Orange")
    } else if (receivedNumber == 3) {
        basic.showString("over 32")
    }
})
let IZONE = 0
radio.setGroup(1)
IZONE = 0
basic.showNumber(IZONE)
