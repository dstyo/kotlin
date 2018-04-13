/*
 * Copyright 2010-2018 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license
 * that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.idea.conversion.copy;

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
@TestMetadata("idea/testData/copyPaste/plainTextConversion")
@TestDataPath("$PROJECT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
public class TextJavaToKotlinCopyPasteConversionTestGenerated extends AbstractTextJavaToKotlinCopyPasteConversionTest {
    public void testAllFilesPresentInPlainTextConversion() throws Exception {
        KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("idea/testData/copyPaste/plainTextConversion"), Pattern.compile("^([^\\.]+)\\.txt$"), TargetBackend.ANY, true);
    }

    @TestMetadata("AsExpression.txt")
    public void testAsExpression() throws Exception {
        KotlinTestUtils.runTest("idea/testData/copyPaste/plainTextConversion/AsExpression.txt", this::doTest);
    }

    @TestMetadata("AsExpressionBody.txt")
    public void testAsExpressionBody() throws Exception {
        KotlinTestUtils.runTest("idea/testData/copyPaste/plainTextConversion/AsExpressionBody.txt", this::doTest);
    }

    @TestMetadata("ImportFromTarget.txt")
    public void testImportFromTarget() throws Exception {
        KotlinTestUtils.runTest("idea/testData/copyPaste/plainTextConversion/ImportFromTarget.txt", this::doTest);
    }

    @TestMetadata("ImportResolve.txt")
    public void testImportResolve() throws Exception {
        KotlinTestUtils.runTest("idea/testData/copyPaste/plainTextConversion/ImportResolve.txt", this::doTest);
    }

    @TestMetadata("InsideIdentifier.txt")
    public void testInsideIdentifier() throws Exception {
        KotlinTestUtils.runTest("idea/testData/copyPaste/plainTextConversion/InsideIdentifier.txt", this::doTest);
    }

    @TestMetadata("IntoComment.txt")
    public void testIntoComment() throws Exception {
        KotlinTestUtils.runTest("idea/testData/copyPaste/plainTextConversion/IntoComment.txt", this::doTest);
    }

    @TestMetadata("IntoRawStringLiteral.txt")
    public void testIntoRawStringLiteral() throws Exception {
        KotlinTestUtils.runTest("idea/testData/copyPaste/plainTextConversion/IntoRawStringLiteral.txt", this::doTest);
    }

    @TestMetadata("IntoStringLiteral.txt")
    public void testIntoStringLiteral() throws Exception {
        KotlinTestUtils.runTest("idea/testData/copyPaste/plainTextConversion/IntoStringLiteral.txt", this::doTest);
    }

    @TestMetadata("KT13529.txt")
    public void testKT13529() throws Exception {
        KotlinTestUtils.runTest("idea/testData/copyPaste/plainTextConversion/KT13529.txt", this::doTest);
    }

    @TestMetadata("KT13529_1.txt")
    public void testKT13529_1() throws Exception {
        KotlinTestUtils.runTest("idea/testData/copyPaste/plainTextConversion/KT13529_1.txt", this::doTest);
    }

    @TestMetadata("MembersIntoClass.txt")
    public void testMembersIntoClass() throws Exception {
        KotlinTestUtils.runTest("idea/testData/copyPaste/plainTextConversion/MembersIntoClass.txt", this::doTest);
    }

    @TestMetadata("MembersToTopLevel.txt")
    public void testMembersToTopLevel() throws Exception {
        KotlinTestUtils.runTest("idea/testData/copyPaste/plainTextConversion/MembersToTopLevel.txt", this::doTest);
    }

    @TestMetadata("Override.txt")
    public void testOverride() throws Exception {
        KotlinTestUtils.runTest("idea/testData/copyPaste/plainTextConversion/Override.txt", this::doTest);
    }

    @TestMetadata("OverrideInterface.txt")
    public void testOverrideInterface() throws Exception {
        KotlinTestUtils.runTest("idea/testData/copyPaste/plainTextConversion/OverrideInterface.txt", this::doTest);
    }

    @TestMetadata("PostProcessing.txt")
    public void testPostProcessing() throws Exception {
        KotlinTestUtils.runTest("idea/testData/copyPaste/plainTextConversion/PostProcessing.txt", this::doTest);
    }

    @TestMetadata("StatementsIntoFunction.txt")
    public void testStatementsIntoFunction() throws Exception {
        KotlinTestUtils.runTest("idea/testData/copyPaste/plainTextConversion/StatementsIntoFunction.txt", this::doTest);
    }

    @TestMetadata("WholeFile.txt")
    public void testWholeFile() throws Exception {
        KotlinTestUtils.runTest("idea/testData/copyPaste/plainTextConversion/WholeFile.txt", this::doTest);
    }
}
