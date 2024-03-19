# Uber System Analysis

## Overview
This repository contains the analysis artifacts for the Uber System, employing various modeling techniques to understand its architecture and components. The analysis is structured around the C4 model, which encompasses context, container, and component diagrams. Additionally, it involves forward and reverse engineering processes to further dissect the system's structure.

### Files Included
- `java.class`
- `files.java`
- `uml.zargo`
- `c4diagram.jpg`

**Trello Workflow Link:** https://trello.com/b/ATnnhR0P/lab-4-ip

## 1. C4 Model
In this section, we utilize the C4 model to delineate the Uber System's architecture. Three key diagrams are produced:
- **Context Diagram**: Illustrates the system's external dependencies and interactions, providing a high-level view of its environment.
- **Container Diagram**: Depicts the various containers within the system and their relationships, helping to understand the overall structure at a macro level.
- **Component Diagram**: Details the internal components of each container, elucidating their interactions and functionalities.

## 2. Forward Engineering
Here, we leverage forward engineering techniques to translate our class diagrams created in ArgoUML into Java code. The process involves meticulously defining classes, attributes, methods, and relationships within ArgoUML, followed by generating the Java classes using the built-in functionalities. These generated Java files are then compiled to obtain the corresponding `.class` files.

## 3. Reverse Engineering
In this segment, reverse engineering methodologies are employed to dissect the compiled Java `.class` files back into their original Java source code. Utilizing tools such as DJ Decompiler or JAD, we extract the Java source files from the compiled binaries. Subsequently, these Java files are imported back into ArgoUML, enabling the recreation of class diagrams based on the recovered source code. This process aids in understanding the system's architecture from a reverse-engineered perspective.

By following these systematic approaches, we gain comprehensive insights into the Uber System's architecture, facilitating better understanding, maintenance, and evolution of the software.
