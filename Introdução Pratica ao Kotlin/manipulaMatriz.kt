fun main() {
    val kotlin = "🙂"
    println(kotlin)
	
    var matriz1 = Array(9) { Array(9) { "[ ]" } }
    for (i in 0 .. 8)
        matriz1[i][i]="[X]"

    imprimeMatriz(matriz1)  
	
    var matriz2 = Array(9) { Array(9) { "[ ]" } }
    for (i in 0 .. 8)
        for(j in 0 .. 8)
        	if (((i+j-1)%2)==0) matriz2[i][j]="[X]"
    imprimeMatriz(matriz2)  
	
    var matriz3 = Array(9) { Array(9) { "[ ]" } }
    for (i in 0 .. 8)
        for(j in 0 .. 8)
        	if (((i+j-1)%2)!=0) matriz3[i][j]="[X]"
    imprimeMatriz(matriz3)  
    
    var matriz4 = Array(9) { Array(9) { "[ ]" } }
    for (i in 0 .. 8)
        matriz4[(i)][(8-i)]="[X]"
    imprimeMatriz(matriz4)  
	
}

fun imprimeMatriz(matriz:Array<Array<String>>){
    for (i in 0 .. 8){
        println()
        for (j in 0 .. 8){
            print(matriz[i][j])
        }
    }
    println()
}
