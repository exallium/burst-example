package com.exallium.librarytestbed

import com.squareup.burst.BurstJUnit4
import org.junit.Assert
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(BurstJUnit4::class)
class BurstSampleTest(burstSampleBoolean1: BurstSampleBooleanEnum,
                      burstSampleBoolean2: BurstSampleBooleanEnum) {

    private lateinit var testSubject: BurstSample

    private val a: Boolean
    private val b: Boolean

    init {
        a = burstSampleBoolean1 == BurstSampleBooleanEnum.TRUE
        b = burstSampleBoolean2 == BurstSampleBooleanEnum.FALSE
    }

    @Before
    fun setUp() {
        testSubject = BurstSample()
    }

    @Test
    fun testBurstSamples() {
        // WHEN
        val result = testSubject.sampleFunction(a, b)

        // THEN
        Assert.assertEquals(if (a xor b) {
            "xor"
        } else {
            "not xor"
        }, result)
    }

}