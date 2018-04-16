/*
 * Copyright 2010-2018 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license
 * that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.idea;

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
@TestMetadata("idea/testData/smartSelection")
@TestDataPath("$PROJECT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
public class SmartSelectionTestGenerated extends AbstractSmartSelectionTest {
    public void testAllFilesPresentInSmartSelection() throws Exception {
        KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("idea/testData/smartSelection"), Pattern.compile("^([^.]+)\\.kt$"), TargetBackend.ANY, true);
    }

    @TestMetadata("commentsAndExtraSpaces.kt")
    public void testCommentsAndExtraSpaces() throws Exception {
        KotlinTestUtils.runTest(this::doTestSmartSelection,TargetBackend.ANY, "idea/testData/smartSelection/commentsAndExtraSpaces.kt");
    }

    @TestMetadata("labelledStatement.kt")
    public void testLabelledStatement() throws Exception {
        KotlinTestUtils.runTest(this::doTestSmartSelection,TargetBackend.ANY, "idea/testData/smartSelection/labelledStatement.kt");
    }

    @TestMetadata("labelledThis.kt")
    public void testLabelledThis() throws Exception {
        KotlinTestUtils.runTest(this::doTestSmartSelection,TargetBackend.ANY, "idea/testData/smartSelection/labelledThis.kt");
    }

    @TestMetadata("lambdaCalls.kt")
    public void testLambdaCalls() throws Exception {
        KotlinTestUtils.runTest(this::doTestSmartSelection,TargetBackend.ANY, "idea/testData/smartSelection/lambdaCalls.kt");
    }

    @TestMetadata("multilineCalls.kt")
    public void testMultilineCalls() throws Exception {
        KotlinTestUtils.runTest(this::doTestSmartSelection,TargetBackend.ANY, "idea/testData/smartSelection/multilineCalls.kt");
    }

    @TestMetadata("multilineOperations.kt")
    public void testMultilineOperations() throws Exception {
        KotlinTestUtils.runTest(this::doTestSmartSelection,TargetBackend.ANY, "idea/testData/smartSelection/multilineOperations.kt");
    }

    @TestMetadata("objectLiteral.kt")
    public void testObjectLiteral() throws Exception {
        KotlinTestUtils.runTest(this::doTestSmartSelection,TargetBackend.ANY, "idea/testData/smartSelection/objectLiteral.kt");
    }

    @TestMetadata("parenthesized.kt")
    public void testParenthesized() throws Exception {
        KotlinTestUtils.runTest(this::doTestSmartSelection,TargetBackend.ANY, "idea/testData/smartSelection/parenthesized.kt");
    }

    @TestMetadata("simple.kt")
    public void testSimple() throws Exception {
        KotlinTestUtils.runTest(this::doTestSmartSelection,TargetBackend.ANY, "idea/testData/smartSelection/simple.kt");
    }

    @TestMetadata("superExpression.kt")
    public void testSuperExpression() throws Exception {
        KotlinTestUtils.runTest(this::doTestSmartSelection,TargetBackend.ANY, "idea/testData/smartSelection/superExpression.kt");
    }

    @TestMetadata("superExpressionWithLabel.kt")
    public void testSuperExpressionWithLabel() throws Exception {
        KotlinTestUtils.runTest(this::doTestSmartSelection,TargetBackend.ANY, "idea/testData/smartSelection/superExpressionWithLabel.kt");
    }

    @TestMetadata("superExpressionWithLabelAndType.kt")
    public void testSuperExpressionWithLabelAndType() throws Exception {
        KotlinTestUtils.runTest(this::doTestSmartSelection,TargetBackend.ANY, "idea/testData/smartSelection/superExpressionWithLabelAndType.kt");
    }

    @TestMetadata("superExpressionWithType.kt")
    public void testSuperExpressionWithType() throws Exception {
        KotlinTestUtils.runTest(this::doTestSmartSelection,TargetBackend.ANY, "idea/testData/smartSelection/superExpressionWithType.kt");
    }

    @TestMetadata("typeInSuperExpression.kt")
    public void testTypeInSuperExpression() throws Exception {
        KotlinTestUtils.runTest(this::doTestSmartSelection,TargetBackend.ANY, "idea/testData/smartSelection/typeInSuperExpression.kt");
    }

    @TestMetadata("typeInSuperExpressionWithLabel.kt")
    public void testTypeInSuperExpressionWithLabel() throws Exception {
        KotlinTestUtils.runTest(this::doTestSmartSelection,TargetBackend.ANY, "idea/testData/smartSelection/typeInSuperExpressionWithLabel.kt");
    }
}
