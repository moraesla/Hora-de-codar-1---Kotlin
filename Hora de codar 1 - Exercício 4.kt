fun main(){

    //area do retangulo
    println("Informe a base do retangulo: ")
    var base_retangulo = readln().toInt()

    println("Informe a altura do retangulo: ")
    var altura_retangulo = readln().toInt()

    var area = base_retangulo * altura_retangulo

    println("O resultado é: $area\n")

    //area do quadrado
    println("Informe o lado do quadrado: ")
    var lado = readln().toInt()

    var area_quadrado = lado * lado

    println("O resultado é:  $area_quadrado²\n")

    //area do losango
    println("Informe diagonal maior do losango: ")
    var diagonal_maior = readln().toInt()

    println("Informe diagonal menor do losango: ")
    var diagonal_menor = readln().toInt()

    var area_losango = (diagonal_menor * diagonal_maior) / 2

    println("O resultado é: $area_losango\n")

    //area do trapezio
    println("Informe base maior do trapezio: ")
    var base_maior = readln().toInt()

    println("Informe base menor do trapezio: ")
    var base_menor = readln().toInt()

    println("Informe a altura do trapezio: ")
    var altura_trapezio = readln().toInt()

    var area_trapezio = (base_maior + base_menor) * altura_trapezio / 2

    println("O resultado é: $area_trapezio\n")

    //area do paralelogramo
    println("Informe a base do paralelograma: ")
    var base = readln().toInt()

    println("Informe a altura do paralelogramo: ")
    var altura = readln().toInt()

    var area_paralelogramo = altura * base

    println("O resultado é: $area_paralelogramo\n")

    //area do triangulo
    println("Informe a base do triangulo: ")
    var base_triangulo = readln().toInt()

    println("Informe a altura do triangulo: ")
    var altura_triangulo = readln().toInt()

    var area_triangulo = base_triangulo * altura_triangulo / 2

    println("O resultado é: $area_triangulo\n")

    //area do circulo

    var pi = 3.14

    println("Informe o raio do circulo: ")
    var raio = readln().toInt()

    var area_circulo = pi * (raio * raio)

    println("O resultado é: $area_circulo")
    
}
