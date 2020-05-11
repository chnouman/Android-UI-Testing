package com.mnouman.myapplication

import org.junit.runner.RunWith
import org.junit.runners.Suite

/*
* A TestSuite is a Composite of Tests. It runs a collection of test cases.
* */
@RunWith(Suite::class)
@Suite.SuiteClasses(MainActivityTest::class,SecondActivityTest::class)
class MyTestSuite