/*
 * Copyright 2010-2018 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license
 * that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.idea.hierarchy;

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
@RunWith(JUnit3RunnerWithInners.class)
public class HierarchyTestGenerated extends AbstractHierarchyTest {
    @TestMetadata("idea/testData/hierarchy/class/type")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class Type extends AbstractHierarchyTest {
        public void testAllFilesPresentInType() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("idea/testData/hierarchy/class/type"), Pattern.compile("^([^\\.]+)$"), TargetBackend.ANY, false);
        }

        @TestMetadata("CaretAtAnnotation")
        public void testCaretAtAnnotation() throws Exception {
            KotlinTestUtils.runTest("idea/testData/hierarchy/class/type/CaretAtAnnotation/", this::doTypeClassHierarchyTest);
        }

        @TestMetadata("CaretAtConstructor")
        public void testCaretAtConstructor() throws Exception {
            KotlinTestUtils.runTest("idea/testData/hierarchy/class/type/CaretAtConstructor/", this::doTypeClassHierarchyTest);
        }

        @TestMetadata("CaretAtFabricMethod")
        public void testCaretAtFabricMethod() throws Exception {
            KotlinTestUtils.runTest("idea/testData/hierarchy/class/type/CaretAtFabricMethod/", this::doTypeClassHierarchyTest);
        }

        @TestMetadata("CaretAtImport")
        public void testCaretAtImport() throws Exception {
            KotlinTestUtils.runTest("idea/testData/hierarchy/class/type/CaretAtImport/", this::doTypeClassHierarchyTest);
        }

        @TestMetadata("CaretAtJavaType")
        public void testCaretAtJavaType() throws Exception {
            KotlinTestUtils.runTest("idea/testData/hierarchy/class/type/CaretAtJavaType/", this::doTypeClassHierarchyTest);
        }

        @TestMetadata("CaretAtModifierList")
        public void testCaretAtModifierList() throws Exception {
            KotlinTestUtils.runTest("idea/testData/hierarchy/class/type/CaretAtModifierList/", this::doTypeClassHierarchyTest);
        }

        @TestMetadata("CaretAtReceiverExtFun")
        public void testCaretAtReceiverExtFun() throws Exception {
            KotlinTestUtils.runTest("idea/testData/hierarchy/class/type/CaretAtReceiverExtFun/", this::doTypeClassHierarchyTest);
        }

        @TestMetadata("CaretAtSuperCall")
        public void testCaretAtSuperCall() throws Exception {
            KotlinTestUtils.runTest("idea/testData/hierarchy/class/type/CaretAtSuperCall/", this::doTypeClassHierarchyTest);
        }

        @TestMetadata("CaretAtSuperTypeCallEntry")
        public void testCaretAtSuperTypeCallEntry() throws Exception {
            KotlinTestUtils.runTest("idea/testData/hierarchy/class/type/CaretAtSuperTypeCallEntry/", this::doTypeClassHierarchyTest);
        }

        @TestMetadata("CaretAtSupertypesList")
        public void testCaretAtSupertypesList() throws Exception {
            KotlinTestUtils.runTest("idea/testData/hierarchy/class/type/CaretAtSupertypesList/", this::doTypeClassHierarchyTest);
        }

        @TestMetadata("CaretAtTypeReference")
        public void testCaretAtTypeReference() throws Exception {
            KotlinTestUtils.runTest("idea/testData/hierarchy/class/type/CaretAtTypeReference/", this::doTypeClassHierarchyTest);
        }

        @TestMetadata("CaretInClassBody")
        public void testCaretInClassBody() throws Exception {
            KotlinTestUtils.runTest("idea/testData/hierarchy/class/type/CaretInClassBody/", this::doTypeClassHierarchyTest);
        }

        @TestMetadata("ClassFromClass")
        public void testClassFromClass() throws Exception {
            KotlinTestUtils.runTest("idea/testData/hierarchy/class/type/ClassFromClass/", this::doTypeClassHierarchyTest);
        }

        @TestMetadata("ClassFromObject")
        public void testClassFromObject() throws Exception {
            KotlinTestUtils.runTest("idea/testData/hierarchy/class/type/ClassFromObject/", this::doTypeClassHierarchyTest);
        }

        @TestMetadata("ClassInClassObject")
        public void testClassInClassObject() throws Exception {
            KotlinTestUtils.runTest("idea/testData/hierarchy/class/type/ClassInClassObject/", this::doTypeClassHierarchyTest);
        }

        @TestMetadata("ClassInPackage")
        public void testClassInPackage() throws Exception {
            KotlinTestUtils.runTest("idea/testData/hierarchy/class/type/ClassInPackage/", this::doTypeClassHierarchyTest);
        }

        @TestMetadata("InnerClass")
        public void testInnerClass() throws Exception {
            KotlinTestUtils.runTest("idea/testData/hierarchy/class/type/InnerClass/", this::doTypeClassHierarchyTest);
        }

        @TestMetadata("JKJHierarchy")
        public void testJKJHierarchy() throws Exception {
            KotlinTestUtils.runTest("idea/testData/hierarchy/class/type/JKJHierarchy/", this::doTypeClassHierarchyTest);
        }

        @TestMetadata("JavaFromKotlin")
        public void testJavaFromKotlin() throws Exception {
            KotlinTestUtils.runTest("idea/testData/hierarchy/class/type/JavaFromKotlin/", this::doTypeClassHierarchyTest);
        }

        @TestMetadata("JavaFromKotlinByRef")
        public void testJavaFromKotlinByRef() throws Exception {
            KotlinTestUtils.runTest("idea/testData/hierarchy/class/type/JavaFromKotlinByRef/", this::doTypeClassHierarchyTest);
        }

        @TestMetadata("JavaFromKotlinForKotlinClass")
        public void testJavaFromKotlinForKotlinClass() throws Exception {
            KotlinTestUtils.runTest("idea/testData/hierarchy/class/type/JavaFromKotlinForKotlinClass/", this::doTypeClassHierarchyTest);
        }

        @TestMetadata("JavaStyleClassLiteralInvalidCode")
        public void testJavaStyleClassLiteralInvalidCode() throws Exception {
            KotlinTestUtils.runTest("idea/testData/hierarchy/class/type/JavaStyleClassLiteralInvalidCode/", this::doTypeClassHierarchyTest);
        }

        @TestMetadata("JetInt")
        public void testJetInt() throws Exception {
            KotlinTestUtils.runTest("idea/testData/hierarchy/class/type/JetInt/", this::doTypeClassHierarchyTest);
        }

        @TestMetadata("KJKHierarchy")
        public void testKJKHierarchy() throws Exception {
            KotlinTestUtils.runTest("idea/testData/hierarchy/class/type/KJKHierarchy/", this::doTypeClassHierarchyTest);
        }

        @TestMetadata("KotlinFromJava")
        public void testKotlinFromJava() throws Exception {
            KotlinTestUtils.runTest("idea/testData/hierarchy/class/type/KotlinFromJava/", this::doTypeClassHierarchyTest);
        }

        @TestMetadata("KotlinFromJavaByRef")
        public void testKotlinFromJavaByRef() throws Exception {
            KotlinTestUtils.runTest("idea/testData/hierarchy/class/type/KotlinFromJavaByRef/", this::doTypeClassHierarchyTest);
        }

        @TestMetadata("KotlinFromKotlinByRef")
        public void testKotlinFromKotlinByRef() throws Exception {
            KotlinTestUtils.runTest("idea/testData/hierarchy/class/type/KotlinFromKotlinByRef/", this::doTypeClassHierarchyTest);
        }

        @TestMetadata("Object")
        public void testObject() throws Exception {
            KotlinTestUtils.runTest("idea/testData/hierarchy/class/type/Object/", this::doTypeClassHierarchyTest);
        }

        @TestMetadata("TwoChildren")
        public void testTwoChildren() throws Exception {
            KotlinTestUtils.runTest("idea/testData/hierarchy/class/type/TwoChildren/", this::doTypeClassHierarchyTest);
        }
    }

    @TestMetadata("idea/testData/hierarchy/class/super")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class Super extends AbstractHierarchyTest {
        public void testAllFilesPresentInSuper() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("idea/testData/hierarchy/class/super"), Pattern.compile("^([^\\.]+)$"), TargetBackend.ANY, false);
        }

        @TestMetadata("JetList")
        public void testJetList() throws Exception {
            KotlinTestUtils.runTest("idea/testData/hierarchy/class/super/JetList/", this::doSuperClassHierarchyTest);
        }

        @TestMetadata("MultiTypeAlias")
        public void testMultiTypeAlias() throws Exception {
            KotlinTestUtils.runTest("idea/testData/hierarchy/class/super/MultiTypeAlias/", this::doSuperClassHierarchyTest);
        }

        @TestMetadata("TwoTraits")
        public void testTwoTraits() throws Exception {
            KotlinTestUtils.runTest("idea/testData/hierarchy/class/super/TwoTraits/", this::doSuperClassHierarchyTest);
        }

        @TestMetadata("TypeAlias")
        public void testTypeAlias() throws Exception {
            KotlinTestUtils.runTest("idea/testData/hierarchy/class/super/TypeAlias/", this::doSuperClassHierarchyTest);
        }
    }

    @TestMetadata("idea/testData/hierarchy/class/sub")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class Sub extends AbstractHierarchyTest {
        public void testAllFilesPresentInSub() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("idea/testData/hierarchy/class/sub"), Pattern.compile("^([^\\.]+)$"), TargetBackend.ANY, false);
        }

        @TestMetadata("AllFromClass")
        public void testAllFromClass() throws Exception {
            KotlinTestUtils.runTest("idea/testData/hierarchy/class/sub/AllFromClass/", this::doSubClassHierarchyTest);
        }

        @TestMetadata("AllFromTrait")
        public void testAllFromTrait() throws Exception {
            KotlinTestUtils.runTest("idea/testData/hierarchy/class/sub/AllFromTrait/", this::doSubClassHierarchyTest);
        }

        @TestMetadata("ClassFromClass")
        public void testClassFromClass() throws Exception {
            KotlinTestUtils.runTest("idea/testData/hierarchy/class/sub/ClassFromClass/", this::doSubClassHierarchyTest);
        }

        @TestMetadata("ClassFromTrait")
        public void testClassFromTrait() throws Exception {
            KotlinTestUtils.runTest("idea/testData/hierarchy/class/sub/ClassFromTrait/", this::doSubClassHierarchyTest);
        }

        @TestMetadata("ConstructorCallCaretAfter")
        public void testConstructorCallCaretAfter() throws Exception {
            KotlinTestUtils.runTest("idea/testData/hierarchy/class/sub/ConstructorCallCaretAfter/", this::doSubClassHierarchyTest);
        }

        @TestMetadata("ConstructorCallCaretBefore")
        public void testConstructorCallCaretBefore() throws Exception {
            KotlinTestUtils.runTest("idea/testData/hierarchy/class/sub/ConstructorCallCaretBefore/", this::doSubClassHierarchyTest);
        }

        @TestMetadata("MultiTypeAlias")
        public void testMultiTypeAlias() throws Exception {
            KotlinTestUtils.runTest("idea/testData/hierarchy/class/sub/MultiTypeAlias/", this::doSubClassHierarchyTest);
        }

        @TestMetadata("ObjectFromClass")
        public void testObjectFromClass() throws Exception {
            KotlinTestUtils.runTest("idea/testData/hierarchy/class/sub/ObjectFromClass/", this::doSubClassHierarchyTest);
        }

        @TestMetadata("ObjectFromTrait")
        public void testObjectFromTrait() throws Exception {
            KotlinTestUtils.runTest("idea/testData/hierarchy/class/sub/ObjectFromTrait/", this::doSubClassHierarchyTest);
        }

        @TestMetadata("SecondaryConstructorCallCaretAfter")
        public void testSecondaryConstructorCallCaretAfter() throws Exception {
            KotlinTestUtils.runTest("idea/testData/hierarchy/class/sub/SecondaryConstructorCallCaretAfter/", this::doSubClassHierarchyTest);
        }

        @TestMetadata("SecondaryConstructorCallCaretBefore")
        public void testSecondaryConstructorCallCaretBefore() throws Exception {
            KotlinTestUtils.runTest("idea/testData/hierarchy/class/sub/SecondaryConstructorCallCaretBefore/", this::doSubClassHierarchyTest);
        }

        @TestMetadata("TraitFromClass")
        public void testTraitFromClass() throws Exception {
            KotlinTestUtils.runTest("idea/testData/hierarchy/class/sub/TraitFromClass/", this::doSubClassHierarchyTest);
        }

        @TestMetadata("TraitFromTrait")
        public void testTraitFromTrait() throws Exception {
            KotlinTestUtils.runTest("idea/testData/hierarchy/class/sub/TraitFromTrait/", this::doSubClassHierarchyTest);
        }

        @TestMetadata("TypeAlias")
        public void testTypeAlias() throws Exception {
            KotlinTestUtils.runTest("idea/testData/hierarchy/class/sub/TypeAlias/", this::doSubClassHierarchyTest);
        }
    }

    @TestMetadata("idea/testData/hierarchy/calls/callers")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class Callers extends AbstractHierarchyTest {
        public void testAllFilesPresentInCallers() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("idea/testData/hierarchy/calls/callers"), Pattern.compile("^([^\\.]+)$"), TargetBackend.ANY, false);
        }

        @TestMetadata("callInsideAnonymousFun")
        public void testCallInsideAnonymousFun() throws Exception {
            KotlinTestUtils.runTest("idea/testData/hierarchy/calls/callers/callInsideAnonymousFun/", this::doCallerHierarchyTest);
        }

        @TestMetadata("callInsideLambda")
        public void testCallInsideLambda() throws Exception {
            KotlinTestUtils.runTest("idea/testData/hierarchy/calls/callers/callInsideLambda/", this::doCallerHierarchyTest);
        }

        @TestMetadata("kotlinClass")
        public void testKotlinClass() throws Exception {
            KotlinTestUtils.runTest("idea/testData/hierarchy/calls/callers/kotlinClass/", this::doCallerHierarchyTest);
        }

        @TestMetadata("kotlinFunction")
        public void testKotlinFunction() throws Exception {
            KotlinTestUtils.runTest("idea/testData/hierarchy/calls/callers/kotlinFunction/", this::doCallerHierarchyTest);
        }

        @TestMetadata("kotlinFunctionNonCallUsages")
        public void testKotlinFunctionNonCallUsages() throws Exception {
            KotlinTestUtils.runTest("idea/testData/hierarchy/calls/callers/kotlinFunctionNonCallUsages/", this::doCallerHierarchyTest);
        }

        @TestMetadata("kotlinInterface")
        public void testKotlinInterface() throws Exception {
            KotlinTestUtils.runTest("idea/testData/hierarchy/calls/callers/kotlinInterface/", this::doCallerHierarchyTest);
        }

        @TestMetadata("kotlinLocalClass")
        public void testKotlinLocalClass() throws Exception {
            KotlinTestUtils.runTest("idea/testData/hierarchy/calls/callers/kotlinLocalClass/", this::doCallerHierarchyTest);
        }

        @TestMetadata("kotlinLocalFunction")
        public void testKotlinLocalFunction() throws Exception {
            KotlinTestUtils.runTest("idea/testData/hierarchy/calls/callers/kotlinLocalFunction/", this::doCallerHierarchyTest);
        }

        @TestMetadata("kotlinLocalFunctionWithNonLocalCallers")
        public void testKotlinLocalFunctionWithNonLocalCallers() throws Exception {
            KotlinTestUtils.runTest("idea/testData/hierarchy/calls/callers/kotlinLocalFunctionWithNonLocalCallers/", this::doCallerHierarchyTest);
        }

        @TestMetadata("kotlinNestedClass")
        public void testKotlinNestedClass() throws Exception {
            KotlinTestUtils.runTest("idea/testData/hierarchy/calls/callers/kotlinNestedClass/", this::doCallerHierarchyTest);
        }

        @TestMetadata("kotlinNestedInnerClass")
        public void testKotlinNestedInnerClass() throws Exception {
            KotlinTestUtils.runTest("idea/testData/hierarchy/calls/callers/kotlinNestedInnerClass/", this::doCallerHierarchyTest);
        }

        @TestMetadata("kotlinPackageFunction")
        public void testKotlinPackageFunction() throws Exception {
            KotlinTestUtils.runTest("idea/testData/hierarchy/calls/callers/kotlinPackageFunction/", this::doCallerHierarchyTest);
        }

        @TestMetadata("kotlinPackageProperty")
        public void testKotlinPackageProperty() throws Exception {
            KotlinTestUtils.runTest("idea/testData/hierarchy/calls/callers/kotlinPackageProperty/", this::doCallerHierarchyTest);
        }

        @TestMetadata("kotlinPrimaryConstructorImplicitCalls")
        public void testKotlinPrimaryConstructorImplicitCalls() throws Exception {
            KotlinTestUtils.runTest("idea/testData/hierarchy/calls/callers/kotlinPrimaryConstructorImplicitCalls/", this::doCallerHierarchyTest);
        }

        @TestMetadata("kotlinPrivateClass")
        public void testKotlinPrivateClass() throws Exception {
            KotlinTestUtils.runTest("idea/testData/hierarchy/calls/callers/kotlinPrivateClass/", this::doCallerHierarchyTest);
        }

        @TestMetadata("kotlinPrivateFunction")
        public void testKotlinPrivateFunction() throws Exception {
            KotlinTestUtils.runTest("idea/testData/hierarchy/calls/callers/kotlinPrivateFunction/", this::doCallerHierarchyTest);
        }

        @TestMetadata("kotlinPrivateProperty")
        public void testKotlinPrivateProperty() throws Exception {
            KotlinTestUtils.runTest("idea/testData/hierarchy/calls/callers/kotlinPrivateProperty/", this::doCallerHierarchyTest);
        }

        @TestMetadata("kotlinProperty")
        public void testKotlinProperty() throws Exception {
            KotlinTestUtils.runTest("idea/testData/hierarchy/calls/callers/kotlinProperty/", this::doCallerHierarchyTest);
        }

        @TestMetadata("kotlinSecondaryConstructor")
        public void testKotlinSecondaryConstructor() throws Exception {
            KotlinTestUtils.runTest("idea/testData/hierarchy/calls/callers/kotlinSecondaryConstructor/", this::doCallerHierarchyTest);
        }

        @TestMetadata("kotlinSecondaryConstructorImplicitCalls")
        public void testKotlinSecondaryConstructorImplicitCalls() throws Exception {
            KotlinTestUtils.runTest("idea/testData/hierarchy/calls/callers/kotlinSecondaryConstructorImplicitCalls/", this::doCallerHierarchyTest);
        }

        @TestMetadata("kotlinUnresolvedFunction")
        public void testKotlinUnresolvedFunction() throws Exception {
            KotlinTestUtils.runTest("idea/testData/hierarchy/calls/callers/kotlinUnresolvedFunction/", this::doCallerHierarchyTest);
        }
    }

    @TestMetadata("idea/testData/hierarchy/calls/callersJava")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class CallersJava extends AbstractHierarchyTest {
        public void testAllFilesPresentInCallersJava() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("idea/testData/hierarchy/calls/callersJava"), Pattern.compile("^([^\\.]+)$"), TargetBackend.ANY, false);
        }

        @TestMetadata("javaMethod")
        public void testJavaMethod() throws Exception {
            KotlinTestUtils.runTest("idea/testData/hierarchy/calls/callersJava/javaMethod/", this::doCallerJavaHierarchyTest);
        }
    }

    @TestMetadata("idea/testData/hierarchy/calls/callees")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class Callees extends AbstractHierarchyTest {
        public void testAllFilesPresentInCallees() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("idea/testData/hierarchy/calls/callees"), Pattern.compile("^([^\\.]+)$"), TargetBackend.ANY, false);
        }

        @TestMetadata("kotlinAnonymousObject")
        public void testKotlinAnonymousObject() throws Exception {
            KotlinTestUtils.runTest("idea/testData/hierarchy/calls/callees/kotlinAnonymousObject/", this::doCalleeHierarchyTest);
        }

        @TestMetadata("kotlinClass")
        public void testKotlinClass() throws Exception {
            KotlinTestUtils.runTest("idea/testData/hierarchy/calls/callees/kotlinClass/", this::doCalleeHierarchyTest);
        }

        @TestMetadata("kotlinClassObject")
        public void testKotlinClassObject() throws Exception {
            KotlinTestUtils.runTest("idea/testData/hierarchy/calls/callees/kotlinClassObject/", this::doCalleeHierarchyTest);
        }

        @TestMetadata("kotlinEnumClass")
        public void testKotlinEnumClass() throws Exception {
            KotlinTestUtils.runTest("idea/testData/hierarchy/calls/callees/kotlinEnumClass/", this::doCalleeHierarchyTest);
        }

        @TestMetadata("kotlinFunction")
        public void testKotlinFunction() throws Exception {
            KotlinTestUtils.runTest("idea/testData/hierarchy/calls/callees/kotlinFunction/", this::doCalleeHierarchyTest);
        }

        @TestMetadata("kotlinInterface")
        public void testKotlinInterface() throws Exception {
            KotlinTestUtils.runTest("idea/testData/hierarchy/calls/callees/kotlinInterface/", this::doCalleeHierarchyTest);
        }

        @TestMetadata("kotlinLocalClass")
        public void testKotlinLocalClass() throws Exception {
            KotlinTestUtils.runTest("idea/testData/hierarchy/calls/callees/kotlinLocalClass/", this::doCalleeHierarchyTest);
        }

        @TestMetadata("kotlinLocalFunction")
        public void testKotlinLocalFunction() throws Exception {
            KotlinTestUtils.runTest("idea/testData/hierarchy/calls/callees/kotlinLocalFunction/", this::doCalleeHierarchyTest);
        }

        @TestMetadata("kotlinNestedClass")
        public void testKotlinNestedClass() throws Exception {
            KotlinTestUtils.runTest("idea/testData/hierarchy/calls/callees/kotlinNestedClass/", this::doCalleeHierarchyTest);
        }

        @TestMetadata("kotlinObject")
        public void testKotlinObject() throws Exception {
            KotlinTestUtils.runTest("idea/testData/hierarchy/calls/callees/kotlinObject/", this::doCalleeHierarchyTest);
        }

        @TestMetadata("kotlinPackageFunction")
        public void testKotlinPackageFunction() throws Exception {
            KotlinTestUtils.runTest("idea/testData/hierarchy/calls/callees/kotlinPackageFunction/", this::doCalleeHierarchyTest);
        }

        @TestMetadata("kotlinPackageProperty")
        public void testKotlinPackageProperty() throws Exception {
            KotlinTestUtils.runTest("idea/testData/hierarchy/calls/callees/kotlinPackageProperty/", this::doCalleeHierarchyTest);
        }

        @TestMetadata("kotlinProperty")
        public void testKotlinProperty() throws Exception {
            KotlinTestUtils.runTest("idea/testData/hierarchy/calls/callees/kotlinProperty/", this::doCalleeHierarchyTest);
        }
    }

    @TestMetadata("idea/testData/hierarchy/overrides")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class Overrides extends AbstractHierarchyTest {
        public void testAllFilesPresentInOverrides() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("idea/testData/hierarchy/overrides"), Pattern.compile("^([^\\.]+)$"), TargetBackend.ANY, false);
        }

        @TestMetadata("kotlinBuiltInMemberFunction")
        public void testKotlinBuiltInMemberFunction() throws Exception {
            KotlinTestUtils.runTest("idea/testData/hierarchy/overrides/kotlinBuiltInMemberFunction/", this::doOverrideHierarchyTest);
        }

        @TestMetadata("kotlinFunctionInClass")
        public void testKotlinFunctionInClass() throws Exception {
            KotlinTestUtils.runTest("idea/testData/hierarchy/overrides/kotlinFunctionInClass/", this::doOverrideHierarchyTest);
        }

        @TestMetadata("kotlinFunctionInTrait")
        public void testKotlinFunctionInTrait() throws Exception {
            KotlinTestUtils.runTest("idea/testData/hierarchy/overrides/kotlinFunctionInTrait/", this::doOverrideHierarchyTest);
        }

        @TestMetadata("kotlinPropertyInClass")
        public void testKotlinPropertyInClass() throws Exception {
            KotlinTestUtils.runTest("idea/testData/hierarchy/overrides/kotlinPropertyInClass/", this::doOverrideHierarchyTest);
        }

        @TestMetadata("kotlinPropertyInTrait")
        public void testKotlinPropertyInTrait() throws Exception {
            KotlinTestUtils.runTest("idea/testData/hierarchy/overrides/kotlinPropertyInTrait/", this::doOverrideHierarchyTest);
        }

        @TestMetadata("kotlinTopLevelFunction")
        public void testKotlinTopLevelFunction() throws Exception {
            KotlinTestUtils.runTest("idea/testData/hierarchy/overrides/kotlinTopLevelFunction/", this::doOverrideHierarchyTest);
        }

        @TestMetadata("kotlinVarParameter")
        public void testKotlinVarParameter() throws Exception {
            KotlinTestUtils.runTest("idea/testData/hierarchy/overrides/kotlinVarParameter/", this::doOverrideHierarchyTest);
        }
    }
}
