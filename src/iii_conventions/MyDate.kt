package iii_conventions

data class MyDate(val year: Int, val month: Int, val dayOfMonth: Int):Comparable<MyDate>{
    override fun compareTo(other: MyDate): Int {
        val otherYear = other.year
        val otherMonth = other.month
        val otherDayOfMonth = other.dayOfMonth
        if(year > otherYear){
            return 1
        } else if(year == otherYear){
            if(month > otherMonth){
                return 1
            } else if(month == otherMonth){
                if(dayOfMonth == otherDayOfMonth){
                    return 0
                } else if(dayOfMonth > otherDayOfMonth){
                    return 1
                } else{
                    return -1
                }
            }else{
                return -1
            }
        } else{
            return -1
        }
        return -1
    }

}

operator fun MyDate.rangeTo(other: MyDate): DateRange = todoTask27()

enum class TimeInterval {
    DAY,
    WEEK,
    YEAR
}

class DateRange(override val start: MyDate, override val endInclusive: MyDate):ClosedRange<MyDate>
