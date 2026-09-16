require 'spec_helper'
require 'json'

describe 'CustomersApi' do
  before do
    @api_instance = FeverClient::CustomersApi.new
  end

  after do
  end

  describe 'test an instance of CustomersApi' do
    it 'should create an instance of CustomersApi' do
      expect(@api_instance).to be_instance_of(FeverClient::CustomersApi)
    end
  end

  describe 'reassign_customers_bulk test' do
    it 'should work' do
    end
  end

end
