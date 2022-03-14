fun main(){
    var x=integer(arrayOf(4,5,6))
    println(x)
    var s= fuct(arrayOf('5',9,3.2,"group",2.8F,44.87F))
    println(s)
    var p=characterarr(arrayOf('a','t','e','b','i','k','o','u'))
    println(p)
}
fun integer(ints:Array<Int>):Int{
    var product=1
    ints.forEach{r->
        product*=r

    }
    return product
}
fun fuct(all:Array<Any>):Float{
    var sum=0.0F
    all.forEach { q ->
        if (q is Float|| q is Double ) {
            sum += q.toString().toFloat()

        }
    }
    return  sum
}
fun characterarr(chars:Array<Char>):Int{
    var num= 0
    chars.forEach { vowel ->
        if (vowel == 'o' || vowel == 'u'|| vowel == 'a' || vowel == 'i' || vowel == 'e') {
            num++
        }
    }
    return num
}




