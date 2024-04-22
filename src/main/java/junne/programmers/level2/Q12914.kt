package junne.programmers.level2

/**
 * @author junhyeon.kim@weversecompany.com
 */
class Q12914 {
    private var answer: Long = 0;
    fun jump(current: Int, n: Int) {
        println("jump(${current}, ${n}))")
        val jumpOne = current + 1
        val jumpTwo = current + 2
        var complete = false;

        if (jumpOne > n) {
            return
        }
        if (jumpTwo > n) {
            return
        }


        jump(jumpOne, n)
        jump(jumpTwo, n)

        if (jumpOne == n) {
            answer++
            println("answer: ${answer}")
            return
        }

        if (jumpTwo == n) {
            answer++
            println("answer: ${answer}")
            return
        }
    }

    fun solution(n: Int): Long {
        // n 칸을 입력 받고, 1칸 혹은 2칸 씩 뛰어서 n칸을 완성하는 모든 경우의 수를 출력

        // 1칸 혹은 2칸 씩 뛰는 행동이 loop 를 통해야 한다 -> 모든 경우를 순회해야 하나?
        // 중복이 있는 조합일까, 덧셈 연산으로 부르트포스 연산을 해야하나
        // n 값의 범위는 1 ~ 2,000: 최대 2,000 번을 반복하는 재귀 함수를 호출
        // 재귀 함수는 합이 n 인 경우에 되는 경우에 완료
        jump(0, n)
        return answer % 1234567
    }
}