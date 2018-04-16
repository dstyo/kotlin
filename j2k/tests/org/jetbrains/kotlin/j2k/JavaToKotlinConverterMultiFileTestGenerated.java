/*
 * Copyright 2010-2018 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license
 * that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.j2k;

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
@TestMetadata("j2k/testData/multiFile")
@TestDataPath("$PROJECT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
public class JavaToKotlinConverterMultiFileTestGenerated extends AbstractJavaToKotlinConverterMultiFileTest {
    public void testAllFilesPresentInMultiFile() throws Exception {
        KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("j2k/testData/multiFile"), Pattern.compile("^([^\\.]+)$"), TargetBackend.ANY, false);
    }

    @TestMetadata("AnnotationWithArrayParameter")
    public void testAnnotationWithArrayParameter() throws Exception {
        KotlinTestUtils.runTest(this::doTest,TargetBackend.ANY, "j2k/testData/multiFile/AnnotationWithArrayParameter/");
    }

    @TestMetadata("FieldToProperty")
    public void testFieldToProperty() throws Exception {
        KotlinTestUtils.runTest(this::doTest,TargetBackend.ANY, "j2k/testData/multiFile/FieldToProperty/");
    }

    @TestMetadata("FunctionalInterfaceAcceptor")
    public void testFunctionalInterfaceAcceptor() throws Exception {
        KotlinTestUtils.runTest(this::doTest,TargetBackend.ANY, "j2k/testData/multiFile/FunctionalInterfaceAcceptor/");
    }

    @TestMetadata("GetterAndSetterUsages")
    public void testGetterAndSetterUsages() throws Exception {
        KotlinTestUtils.runTest(this::doTest,TargetBackend.ANY, "j2k/testData/multiFile/GetterAndSetterUsages/");
    }

    @TestMetadata("KT11952")
    public void testKT11952() throws Exception {
        KotlinTestUtils.runTest(this::doTest,TargetBackend.ANY, "j2k/testData/multiFile/KT11952/");
    }

    @TestMetadata("NullabilityByDFa")
    public void testNullabilityByDFa() throws Exception {
        KotlinTestUtils.runTest(this::doTest,TargetBackend.ANY, "j2k/testData/multiFile/NullabilityByDFa/");
    }

    @TestMetadata("ProtectedVisibility")
    public void testProtectedVisibility() throws Exception {
        KotlinTestUtils.runTest(this::doTest,TargetBackend.ANY, "j2k/testData/multiFile/ProtectedVisibility/");
    }

    @TestMetadata("ToCompanionObject")
    public void testToCompanionObject() throws Exception {
        KotlinTestUtils.runTest(this::doTest,TargetBackend.ANY, "j2k/testData/multiFile/ToCompanionObject/");
    }

    @TestMetadata("ToObject")
    public void testToObject() throws Exception {
        KotlinTestUtils.runTest(this::doTest,TargetBackend.ANY, "j2k/testData/multiFile/ToObject/");
    }
}
