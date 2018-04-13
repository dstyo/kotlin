/*
 * Copyright 2010-2018 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license
 * that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.idea.kdoc;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.JUnit3RunnerWithInners;
import org.jetbrains.kotlin.test.KotlinTestUtils;
import org.jetbrains.kotlin.test.TargetBackend;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.runner.RunWith;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.TestsPackage}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("idea/testData/kdoc/typing")
@TestDataPath("$PROJECT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
public class KDocTypingTestGenerated extends AbstractKDocTypingTest {
    public void testAllFilesPresentInTyping() throws Exception {
        KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("idea/testData/kdoc/typing"), Pattern.compile("^(.+)\\.kt$"), TargetBackend.ANY, true);
    }

    @TestMetadata("closingBracketNotInLink.kt")
    public void testClosingBracketNotInLink() throws Exception {
        KotlinTestUtils.runTest("idea/testData/kdoc/typing/closingBracketNotInLink.kt", this::doTest);
    }

    @TestMetadata("closingBracketOvertype.kt")
    public void testClosingBracketOvertype() throws Exception {
        KotlinTestUtils.runTest("idea/testData/kdoc/typing/closingBracketOvertype.kt", this::doTest);
    }

    @TestMetadata("closingBracketOvertypeEmpty.kt")
    public void testClosingBracketOvertypeEmpty() throws Exception {
        KotlinTestUtils.runTest("idea/testData/kdoc/typing/closingBracketOvertypeEmpty.kt", this::doTest);
    }

    @TestMetadata("closingBracketRefLinkOvertype.kt")
    public void testClosingBracketRefLinkOvertype() throws Exception {
        KotlinTestUtils.runTest("idea/testData/kdoc/typing/closingBracketRefLinkOvertype.kt", this::doTest);
    }

    @TestMetadata("closingParenOvertype.kt")
    public void testClosingParenOvertype() throws Exception {
        KotlinTestUtils.runTest("idea/testData/kdoc/typing/closingParenOvertype.kt", this::doTest);
    }

    @TestMetadata("openingBracket.kt")
    public void testOpeningBracket() throws Exception {
        KotlinTestUtils.runTest("idea/testData/kdoc/typing/openingBracket.kt", this::doTest);
    }

    @TestMetadata("openingBracketRefLink.kt")
    public void testOpeningBracketRefLink() throws Exception {
        KotlinTestUtils.runTest("idea/testData/kdoc/typing/openingBracketRefLink.kt", this::doTest);
    }

    @TestMetadata("openingParen.kt")
    public void testOpeningParen() throws Exception {
        KotlinTestUtils.runTest("idea/testData/kdoc/typing/openingParen.kt", this::doTest);
    }
}
