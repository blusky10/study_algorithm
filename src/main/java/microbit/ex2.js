// 응답기
input.onButtonPressed(Button.A, function () {
    basic.showString("Yes")
})
input.onButtonPressed(Button.B, function () {
    basic.showString("No")
})
input.onButtonPressed(Button.AB, function () {
    basic.showString("Maybe")
})
basic.showString("Question?")
