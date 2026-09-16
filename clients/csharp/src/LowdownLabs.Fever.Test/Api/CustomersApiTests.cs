using System;
using System.IO;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.Reflection;
using Xunit;

using LowdownLabs.Fever.Client;
using LowdownLabs.Fever.Api;

namespace LowdownLabs.Fever.Test.Api
{
    public class CustomersApiTests : IDisposable
    {
        private CustomersApi instance;

        public CustomersApiTests()
        {
            instance = new CustomersApi();
        }

        public void Dispose()
        {
        }

        [Fact]
        public void InstanceTest()
        {
        }

        [Fact]
        public void ReassignCustomersBulkTest()
        {
        }
    }
}
