import org.junit.Test

import org.junit.Assert.*

class MainKtTest {

    @Test
    fun calcCommissionForType1() {
        //arrange
        val amountPreviousTransfers = 0
        val type = TYPE_1
        val amount = 100_00
        val expectedCommission = 0
        //act

        val result = calcCommission(amount, type, amountPreviousTransfers)
        //assert
        assertEquals(expectedCommission, result)
    }
    @Test
    fun calcCommissionForType1OverTheLimit() {
        //arrange
        val amountPreviousTransfers = 0
        val type = TYPE_1
        val amount = 75600_00
        val expectedCommission = 47360
        //act

        val result = calcCommission(amount, type, amountPreviousTransfers)
        //assert
        assertEquals(expectedCommission, result)
    }
    @Test
    fun calcCommissionForType2() {
        //arrange
        val amountPreviousTransfers = 0
        val type = TYPE_2
        val amount = 100_00
        val expectedCommission = 0
        //act

        val result = calcCommission(amount, type, amountPreviousTransfers)
        //assert
        assertEquals(expectedCommission, result)
    }
    @Test
    fun calcCommissionForType2OverTheLimit() {
        //arrange
        val amountPreviousTransfers = 0
        val type = TYPE_2
        val amount = 75600_00
        val expectedCommission = 47360
        //act

        val result = calcCommission(amount, type, amountPreviousTransfers)
        //assert
        assertEquals(expectedCommission, result)
    }
    @Test
    fun calcCommissionForType3() {
        //arrange
        val amountPreviousTransfers = 0
        val type = TYPE_3
        val amount = 100_00
        val expectedCommission = 35
        //act

        val result = calcCommission(amount, type, amountPreviousTransfers)
        //assert
        assertEquals(expectedCommission, result)
    }

    @Test
    fun calcCommissionForType3OverTheLimit() {
        //arrange
        val amountPreviousTransfers = 0
        val type = TYPE_3
        val amount = 75600_00
        val expectedCommission = 56700
        //act

        val result = calcCommission(amount, type, amountPreviousTransfers)
        //assert
        assertEquals(expectedCommission, result)
    }
    @Test
    fun calcCommissionForType4() {
        //arrange
        val amountPreviousTransfers = 0
        val type = TYPE_4
        val amount = 100_00
        val expectedCommission = 35
        //act

        val result = calcCommission(amount, type, amountPreviousTransfers)
        //assert
        assertEquals(expectedCommission, result)
    }
    @Test
    fun calcCommissionForType4OverTheLimit() {
        //arrange
        val amountPreviousTransfers = 0
        val type = TYPE_4
        val amount = 75600_00
        val expectedCommission = 56700
        //act

        val result = calcCommission(amount, type, amountPreviousTransfers)
        //assert
        assertEquals(expectedCommission, result)
    }
    @Test
    fun calcCommissionForType5() {
        //arrange
        val amountPreviousTransfers = 0
        val type = TYPE_5
        val amount = 100_00
        val expectedCommission = 0
        //act

        val result = calcCommission(amount, type, amountPreviousTransfers)
        //assert
        assertEquals(expectedCommission, result)
    }
}