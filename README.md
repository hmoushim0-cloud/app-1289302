# خبير التنفيذ (Expert Execution)

![Platform: Android](https://img.shields.io/badge/Platform-Android-3DDC84?style=flat&logo=android&logoColor=white)
![Kotlin 2.1](https://img.shields.io/badge/Language-Kotlin%202.1-7F52FF?style=flat&logo=kotlin&logoColor=white)
![Jetpack Compose](https://img.shields.io/badge/UI-Jetpack%20Compose-4285F4?style=flat&logo=jetpackcompose&logoColor=white)
![Clean Architecture](https://img.shields.io/badge/Architecture-Clean%20Architecture%20(MVVM)-orange?style=flat)
![Security Verified](https://img.shields.io/badge/Security-Zero--Vulnerability%20Gate-success?style=flat)
![Design: Pure Vectors](https://img.shields.io/badge/Design-Pure%20Vector%20Drawables-blue?style=flat)

> **حلول شاملة لإدارة المشاريع الهندسية**

---

## Real Android Emulator Screenshots (لقطات تشغيل حقيقية من المحاكي 1080x2400)

| الشاشة الرئيسية واستعراض الخدمات | تفاصيل الطلب والتسعير | التتبع المباشر وحالة المعالجة |
|:---:|:---:|:---:|
| ![Main Screen](screenshots/01_home.png) | ![Details](screenshots/02_details.png) | ![Live Tracking](screenshots/03_tracking.png) |

---

## Project Overview (نظرة عامة على المشروع)

يقدم تطبيق خبير التنفيذ منصة شاملة لإدارة المشاريع الهندسية، مع التركيز على الكفاءة والأمان. من خلال تصميم طبقات واضحة، يضمن التطبيق سهولة الاستخدام والوصول إلى الخدمات الهندسية المتخصصة. الربط السحابي الفعال يضمن أمان البيانات وسهولة الوصول إليها. يوفر التطبيق منصة استشارات موثوقة، مما يعزز ثقة العملاء ويزيد من ولائهم. أتمتة العمليات تزيد من كفاءة العمل وتقلل من الوقت المستغرق في معالجة الطلبات، مما يؤدي إلى زيادة الإنتاجية.

---

## Core Features (المميزات الرئيسية)

- **إدارة مشاريع التنفيذ والإشراف بكفاءة**
- **هندسة نظيفة وتصميم طبقات واضحة**
- **ربط سحابي فعال لضمان أمان البيانات**
- **منصة استشارات خبراء موثوقة**

---

## Clean Architecture Layers

```
sa.expert.execution
├── data/
│   └── مشروع هندسيRepository.kt          # Flow-based reactive data source
├── model/
│   └── مشروع هندسيModels.kt              # Immutable business data structures
└── ui/
    ├── MainActivity.kt                # Jetpack Compose Entry Activity
    ├── مشروع هندسيViewModel.kt           # StateFlow UI state holder
    └── مشروع هندسيScreens.kt             # Material 3 Compose vector screens
```

---

## Architectural Invariants & Security Threats

### Invariants (القواعد الصارمة):


### Threat Model (حماية البيانات والتهديدات):


---

## Build Instructions

```bash
# Clone the repository
git clone https://github.com/hmoushim0-cloud/app-1289302.git
cd app-1289302

# Assemble Debug APK
./gradlew :app:assembleDebug
```

---

### Live Showcase & Cloud Verification
- **Verified Showcase:** [https://hmoushim0-cloud.github.io/live-previews/?id=1289302](https://hmoushim0-cloud.github.io/live-previews/?id=1289302)
