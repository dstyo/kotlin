/*
 * Copyright 2010-2018 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license
 * that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.idea.completion.test;

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
@TestMetadata("idea/idea-completion/testData/basic/withLib")
@TestDataPath("$PROJECT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
public class JvmWithLibBasicCompletionTestGenerated extends AbstractJvmWithLibBasicCompletionTest {
    public void testAllFilesPresentInWithLib() throws Exception {
        KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("idea/idea-completion/testData/basic/withLib"), Pattern.compile("^(.+)\\.kt$"), TargetBackend.ANY, false);
    }

    @TestMetadata("NamedArgumentsJava.kt")
    public void testNamedArgumentsJava() throws Exception {
        KotlinTestUtils.runTest(this::doTest,TargetBackend.ANY, "idea/idea-completion/testData/basic/withLib/NamedArgumentsJava.kt");
    }

    @TestMetadata("NamedArgumentsKotlin.kt")
    public void testNamedArgumentsKotlin() throws Exception {
        KotlinTestUtils.runTest(this::doTest,TargetBackend.ANY, "idea/idea-completion/testData/basic/withLib/NamedArgumentsKotlin.kt");
    }

    @TestMetadata("SamAdapter.kt")
    public void testSamAdapter() throws Exception {
        KotlinTestUtils.runTest(this::doTest,TargetBackend.ANY, "idea/idea-completion/testData/basic/withLib/SamAdapter.kt");
    }

    @TestMetadata("SamAdapterAndGenerics.kt")
    public void testSamAdapterAndGenerics() throws Exception {
        KotlinTestUtils.runTest(this::doTest,TargetBackend.ANY, "idea/idea-completion/testData/basic/withLib/SamAdapterAndGenerics.kt");
    }

    @TestMetadata("TopLevelNonImportedExtFun.kt")
    public void testTopLevelNonImportedExtFun() throws Exception {
        KotlinTestUtils.runTest(this::doTest,TargetBackend.ANY, "idea/idea-completion/testData/basic/withLib/TopLevelNonImportedExtFun.kt");
    }

    @TestMetadata("TopLevelNonImportedExtProp.kt")
    public void testTopLevelNonImportedExtProp() throws Exception {
        KotlinTestUtils.runTest(this::doTest,TargetBackend.ANY, "idea/idea-completion/testData/basic/withLib/TopLevelNonImportedExtProp.kt");
    }

    @TestMetadata("TopLevelNonImportedFun.kt")
    public void testTopLevelNonImportedFun() throws Exception {
        KotlinTestUtils.runTest(this::doTest,TargetBackend.ANY, "idea/idea-completion/testData/basic/withLib/TopLevelNonImportedFun.kt");
    }

    @TestMetadata("TopLevelNonImportedProperty.kt")
    public void testTopLevelNonImportedProperty() throws Exception {
        KotlinTestUtils.runTest(this::doTest,TargetBackend.ANY, "idea/idea-completion/testData/basic/withLib/TopLevelNonImportedProperty.kt");
    }
}
